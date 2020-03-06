package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Limelight extends SubsystemBase {
    private NetworkTable table;
    private NetworkTableEntry tv;
    private NetworkTableEntry tx;
    private NetworkTableEntry ty;
    private NetworkTableEntry ta;
    private NetworkTableEntry ts;
    private NetworkTableEntry tl;
    private NetworkTableEntry tshort;
    private NetworkTableEntry tlong;
    private NetworkTableEntry thor;
    private NetworkTableEntry tvert;
    private NetworkTableEntry getpipe;
    private NetworkTableEntry camtran;
    private NetworkTableEntry ledMode;
    private NetworkTableEntry camMode;
    private NetworkTableEntry pipeline;
    private NetworkTableEntry stream;
    private NetworkTableEntry snapshot;
    /**
     * Creates a new Limelight subsystem.
     */
    public Limelight() {
        table = NetworkTableInstance.getDefault().getTable("limelight");
        tv = table.getEntry("tv");
        tx = table.getEntry("tx");
        ty = table.getEntry("ty");
        ta = table.getEntry("ta");
        ts = table.getEntry("ts");
        tl = table.getEntry("tl");
        tshort = table.getEntry("tshort");
        tlong = table.getEntry("tlong");
        thor = table.getEntry("thor");
        tvert = table.getEntry("tvert");
        getpipe = table.getEntry("getpipe");
        camtran = table.getEntry("camtran");
        ledMode = table.getEntry("ledMode");
        camMode = table.getEntry("camMode");
        pipeline = table.getEntry("pipeline");
        stream = table.getEntry("stream");
        snapshot = table.getEntry("snapshot");
    }
  
    @Override
    public void periodic() {
      // This method will be called once per scheduler run
    }
  }
  