/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class DriveBase extends SubsystemBase {
    private SpeedControllerGroup right;
    private SpeedControllerGroup left;
    private CANSparkMax rightOne;
    private CANSparkMax rightTwo;
    private CANSparkMax leftOne;
    private CANSparkMax leftTwo;
    /**
    * Creates a new DriveTrain.
    */
    public DriveBase(CANSparkMax rightA, CANSparkMax rightB, CANSparkMax leftA, CANSparkMax leftB) {
        rightOne = rightA;
        rightTwo = rightB;
        leftOne = leftA;
        leftTwo = leftB;
        rightOne.enableVoltageCompensation(12);
        rightTwo.enableVoltageCompensation(12);
        leftOne.enableVoltageCompensation(12);
        leftTwo.enableVoltageCompensation(12);
        rightTwo.follow(rightOne);
        leftTwo.follow(leftOne);
        right = new SpeedControllerGroup(rightOne,rightTwo);
        left = new SpeedControllerGroup(leftOne,leftTwo);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
