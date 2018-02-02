package org.usfirst.frc.team2557.robot.autonomous;

import org.usfirst.frc.team2557.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class AutoTimeMec extends TimedCommand {
	private double y, x, z;
    public AutoTimeMec(double _y, double _x, double _z, double timeout) {
        super(timeout);
        y = _y;
        x = _x;
        z = _z;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Drive_Sub.mecanum(y, x, z);
    }

    // Called once after timeout
    protected void end() {
    	Robot.Drive_Sub.mecanum(0, 0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
