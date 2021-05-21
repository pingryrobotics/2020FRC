/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int kRightShooterId = 26;
    public static final int kLeftShooterId = 27;
    public static final int kRightDriveOneId = 21;
    public static final int kRightDriveTwoId = 22;
    public static final int kLeftDriveOneId = 23;
    public static final int kLeftDriveTwoId = 24;
    public static final int kIntakeId = 25;
    public static final int kHopperLowerId = 29;
    public static final int kHopperUpperId = 30;
    public static final int kLiftId = 28;
    public static final double kHopperSpeed = 1.0;
    public static final double kIntakeSpeed = -1.0;
    public static final double kImageCaptureLatency = 11.0 / 1000.0;
}
