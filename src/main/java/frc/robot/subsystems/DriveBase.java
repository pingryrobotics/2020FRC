/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;

import frc.robot.Constants;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class DriveBase extends SubsystemBase {
    private SpeedControllerGroup right;
    private SpeedControllerGroup left;
    CANSparkMax frontRight;
    CANSparkMax frontLeft;
    CANSparkMax backRight;
    CANSparkMax backLeft;
    /**
    * Creates a new DriveTrain.
    */
    public DriveBase() {
		frontRight = new CANSparkMax(Constants.kRightDriveOneId, MotorType.kBrushless);
        frontLeft = new CANSparkMax(Constants.kLeftDriveOneId, MotorType.kBrushless);
        backLeft = new CANSparkMax(Constants.kLeftDriveTwoId, MotorType.kBrushless);
        backRight = new CANSparkMax(Constants.kRightDriveTwoId, MotorType.kBrushless);
        frontRight.enableVoltageCompensation(12);
        backRight.enableVoltageCompensation(12);
        frontLeft.enableVoltageCompensation(12);
        backLeft.enableVoltageCompensation(12);
        backRight.follow(frontRight);
        backLeft.follow(frontLeft);
        right = new SpeedControllerGroup(frontRight, backRight);
        left = new SpeedControllerGroup(frontLeft, backLeft);
    }

	public void move(double leftPow, double rightPow) {
		frontRight.set(-rightPow);
		frontLeft.set(leftPow);
	}

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
