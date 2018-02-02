package org.usfirst.frc.team2557.robot.autonomous;

import org.usfirst.frc.team2557.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoMecMovement extends Command {
	private double y, x, z, time;
    public AutoMecMovement(double _y, double _x, double _z, double _time) {
        // Use requires() here to declare subsystem dependencies
         requires(Robot.Drive_Sub);
    	y = _y;
    	x = _x;
    	z = _z;
    	time = _time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Drive_Sub.mecanum(y, x, z);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return (timeSinceInitialized()>time);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Drive_Sub.mecanum(0, 0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
