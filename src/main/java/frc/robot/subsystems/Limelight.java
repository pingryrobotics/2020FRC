// package frc.robot.subsystems;

// import edu.wpi.first.networktables.NetworkTable;
// import edu.wpi.first.networktables.NetworkTableEntry;
// import edu.wpi.first.networktables.NetworkTableInstance;
// import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import frc.robot.Constants;

// public class Limelight extends SubsystemBase {
//     private NetworkTable table;
//     private NetworkTableEntry tv;
//     private NetworkTableEntry tx;
//     private NetworkTableEntry ty;
//     private NetworkTableEntry ta;
//     private NetworkTableEntry ts;
//     private NetworkTableEntry tl;
//     private NetworkTableEntry tshort;
//     private NetworkTableEntry tlong;
//     private NetworkTableEntry thor;
//     private NetworkTableEntry tvert;
//     private NetworkTableEntry getpipe;
//     private NetworkTableEntry camtran;
//     private NetworkTableEntry ledMode;
//     private NetworkTableEntry camMode;
//     private NetworkTableEntry pipeline;
//     private NetworkTableEntry stream;
//     private NetworkTableEntry snapshot;
//     public double latency;
//     public LedMode givenLedMode;
//     public int givenPipeline;
//     public double xOffset;
//     public double yOffset;
//     public double area;
//     public LedMode desiredLedMode = LedMode.OFF;
//     public int desiredPipeline = 0;
//     public int desiredStream = 2;
//     public int desiredSnapshot = 0;
//     private boolean mOutputsHaveChanged = true;
//     private boolean mSeesTarget = false;

//     public enum LedMode{
//         PIPELINE, OFF, BLINK, ON
//     }
//     public enum CamMode{
//         VISION, DRIVER
//     }
//     /**
//      * Creates a new Limelight subsystem.
//      */
//     public Limelight() {
//         table = NetworkTableInstance.getDefault().getTable("limelight");
//         tv = table.getEntry("tv");
//         tx = table.getEntry("tx");
//         ty = table.getEntry("ty");
//         ta = table.getEntry("ta");
//         ts = table.getEntry("ts");
//         tl = table.getEntry("tl");
//         tshort = table.getEntry("tshort");
//         tlong = table.getEntry("tlong");
//         thor = table.getEntry("thor");
//         tvert = table.getEntry("tvert");
//         getpipe = table.getEntry("getpipe");
//         camtran = table.getEntry("camtran");
//         ledMode = table.getEntry("ledMode");
//         camMode = table.getEntry("camMode");
//         pipeline = table.getEntry("pipeline");
//         stream = table.getEntry("stream");
//         snapshot = table.getEntry("snapshot");
//     }

//     @Override
//     public void periodic() {
//         SmartDashboard.putBoolean("Limelight Has Target", mSeesTarget);
//         SmartDashboard.putNumber("Limelight Pipeline Latency (ms)", latency);
//         latency = tl.getDouble(0) / 1000.0 + Constants.kImageCaptureLatency;
//         givenLedMode = LedMode.values()[(int) ledMode.getDouble(1.0)];
//         givenPipeline = (int) pipeline.getDouble(0.0);
//         xOffset = tx.getDouble(0.0);
//         yOffset = ty.getDouble(0.0);
//         area = ta.getDouble(0.0);
//         mSeesTarget = tv.getDouble(0) == 1.0;
//         if (givenLedMode != desiredLedMode || givenPipeline != desiredPipeline){
//             mOutputsHaveChanged = true;
//         }
//         if(mOutputsHaveChanged){
//             // ledMode.setNumber((int)desiredLedMode);
//             // camMode.setNumber((int) camMode);
//             // pipeline.setNumber(desiredPipeline);
//             // stream.setNumber(desiredStream);
//             // snapshot.setNumber(desiredSnapshot);
//         }
//     }
//     public void setLed(LedMode mode) {
//         desiredLedMode = mode;
//     }

//     public void setPipeline(int mode) {
//         desiredPipeline = mode;
//     }
//     public void triggerOutputs() {
//         mOutputsHaveChanged = true;
//     }
//     public int getPipeline() {
//         return givenPipeline;
//     }
//     public int getLedMode() {
//         return givenLedMode;
//     }
//     public boolean seesTarget() {
//         return mSeesTarget;
//     }
//   }
