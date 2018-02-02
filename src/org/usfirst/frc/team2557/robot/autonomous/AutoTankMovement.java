package org.usfirst.frc.team2557.robot.autonomous;

import org.usfirst.frc.team2557.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoTankMovement extends Command {
	private double l, r, time;
    public AutoTankMovement(double _left, double _right, double _time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	l = _left;
    	r = _right;
    	time = _time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Drive_Sub.tank(l, r);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return (timeSinceInitialized()>time);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Drive_Sub.tank(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
