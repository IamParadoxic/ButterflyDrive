/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;
import org.usfirst.frc.team2557.robot.commands.Drive_Com;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive_Sub extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		 setDefaultCommand(new Drive_Com());
	}
	public void ButterflyDrive() {
		if (RobotMap.mec) {
			RobotMap.mDrive.driveCartesian(-Robot.m_oi.gamepad1.getRawAxis(0)*0.8, Robot.m_oi.gamepad1.getRawAxis(1)*0.8,
					Robot.m_oi.gamepad1.getRawAxis(4)*0.8);
		} else if (!RobotMap.mec) {
			RobotMap.tDrive.tankDrive(Robot.m_oi.gamepad1.getRawAxis(1)*0.8, Robot.m_oi.gamepad1.getRawAxis(5)*0.8);
		}
	}
	public void tank(double _left, double _right) {
		RobotMap.tDrive.tankDrive(_left, _right);
	}
	public void mecanum(double FandB, double LandR, double turn) {
		RobotMap.mDrive.driveCartesian(FandB, LandR, turn);
	}
}