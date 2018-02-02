package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Sol_Sub extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public  void SolF() {
    	RobotMap.Sol.set(Value.kForward);
    	RobotMap.mec=true;
    }
  
    public  void SolR() {
    	RobotMap.Sol.set(Value.kReverse);
    	RobotMap.mec =false;
    }
}

