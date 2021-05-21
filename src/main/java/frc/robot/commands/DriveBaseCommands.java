package frc.robot.commands.drive_commands;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;



public class DriveBaseCommands extends CommandBase{
    private static double pTurn = 0.01; //Power % per degree
    /*private static double iTurn = 0;
    private static double dTurn = 0;*/
    private static double forwardPower = 0.2;
    private final DriveBase m_subsystem;
    /**
     * Drive commands for tank drive using joysticks
     */
    public DriveBaseCommands(DriveBase m_subsystem){
        m_subsystem = subsystem;
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(subsystem);
    }
    public void initialize(){
        /*Robot.aPrevError = 0;
        Robot.aIntegral = 0;*/
    }

    public void execute(){
        //Allows us to slow down driving as necessary.
        double driveFactor = Robot.RobotContainer.drive1.getRawAxis(2);
        double leftPow = 0;
        double rightPow = 0;
        //Fine motor controls
        if(Robot.RobotContainer.drive2.getRawButton(3)){
            
        }else if(Robot.RobotContainer.drive2.getRawButton(2)){
            leftPow = -0.05;
            rightPow = -0.05;
        }else if(Robot.oi.drive1.getRawButton(11) || Robot.RobotContainer.drive2.getRawButton(5)){
            leftPow = 0.15;
            rightPow = 0.15;
        }else if(Robot.oi.drive1.getRawButton(10) || Robot.RobotContainer.drive2.getRawButton(4)){
            leftPow = -0.15;
            rightPow = -0.15;
        }else if (Robot.RobotContainer.drive2.getRawButton(1)){
            double tx = Robot.tx.getDouble(0);
            double pMod = tx*pTurn;
            
           /* double deriv = (tx - Robot.aPrevError) /.02;
            double dMod = dTurn*deriv;
            Robot.aIntegral += (tx * .02);
            double iMod = (Robot.aIntegral * iTurn);*/

            leftPow = forwardPower + pMod/* + dMod + iMod*/;
            rightPow = forwardPower -  pMod/* - dMod - iMod*/;

            //Robot.aPrevError = tx;
        }else{
            //Regular move
            leftPow = -Math.pow(Robot.RobotContainer.drive2.getRawAxis(1),1)*driveFactor;
            rightPow = -Math.pow(Robot.RobotContainer.drive1.getRawAxis(1),1)*driveFactor;
        }
        m_subsystem.move(leftPow,rightPow);
    }

    @Override
    public boolean isFinished(){
        return false;
    }

    @Override
    public void end(){
        Robot.drive.move(0,0);
    }

    @Override
    protected void interrupted() {
        Robot.drive.move(0,0);
    }
    
}