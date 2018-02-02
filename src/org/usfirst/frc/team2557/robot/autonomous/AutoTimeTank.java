package org.usfirst.frc.team2557.robot.autonomous;

import org.usfirst.frc.team2557.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class AutoTimeTank extends TimedCommand {
	private double left, right;
    public AutoTimeTank(double _l, double _r, double timeout) {
        super(timeout);
        left = _l;
        right = _r;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Drive_Sub.tank(left, right);
    }

    // Called once after timeout
    protected void end() {
    	Robot.Drive_Sub.tank(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
