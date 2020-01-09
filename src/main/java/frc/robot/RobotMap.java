/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
  public static int DRV_LEFT        = 0,
                    DRV_RIGHT       = 1,
                    SPINNER_MOTOR   = 2,
                    SHOOTER_MOTOR_1 = 0,
                    SHOOTER_MOTOR_2 = 1,
                    INTAKE_MOTOR    = 3,
                    INTAKE_ARM_MOTOR= 4;
  public static double shooter_kF = 2.73,
                       shooter_kP = 3,
                       shooter_kI = 0.015,
                       shooter_kD = 12;
}
