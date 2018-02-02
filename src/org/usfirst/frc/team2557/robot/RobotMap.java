/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2557.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your train subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public static boolean mec;
	
	public static WPI_TalonSRX FR;
	public static WPI_TalonSRX FL;
	public static WPI_TalonSRX BR;
	public static WPI_TalonSRX BL;
	
	public static SpeedControllerGroup left;
	public static SpeedControllerGroup right;
	
	public static DoubleSolenoid Sol;
	
	public static DifferentialDrive tDrive;
	public static MecanumDrive mDrive;
	
	public static void init(){
		FR= new WPI_TalonSRX(3);
		FL= new WPI_TalonSRX(1);
		BR= new WPI_TalonSRX(4);
		BL= new WPI_TalonSRX(2);
		left = new SpeedControllerGroup(FL, BL);
		right = new SpeedControllerGroup(FR, BR);
		tDrive= new DifferentialDrive(left, right);
		tDrive.setSafetyEnabled(false);
		mDrive= new MecanumDrive(FL, BL, FR, BR);
		mDrive.setSafetyEnabled(false);
		
		Sol = new DoubleSolenoid(1, 0, 1);
		
		mec = false;
	}
}
