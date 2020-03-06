package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
public class Hopper extends SubsystemBase {
  private CANSparkMax lower;
  private CANSparkMax upper;
  public double kFlip = 1;
  private double angle = 0;
  private Boolean on = true;
  /**
   * Creates a new ExampleSubsystem.
   */
  public Hopper(CANSparkMax lowerHopper, CANSparkMax upperHopper) {
    upper = upperHopper;
    lower = lowerHopper;
    upper.setInverted(true);
    lower.setInverted(false);
    upper.setVoltage(11);
    lower.setVoltage(11);
  }
  @Override
  public void periodic() {
    if (on){
        lower.set(kFlip*Constants.kHopperSpeed);
        upper.set(kFlip*Constants.kHopperSpeed);
    }
    else{
        lower.set(0);
        upper.set(0);
    }
  }
  public void flipDirection(){
    kFlip = -kFlip;
  }
  public void toggleStart(){
      on = !on;
  }
}
