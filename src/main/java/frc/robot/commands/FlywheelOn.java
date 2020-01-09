/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

public class FlywheelOn extends Command {
  public FlywheelOn() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.shooter);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //Robot.shooter.setSpeed((Robot.m_oi.drvJoy.getThrottle() + 1)/2);
    double targetVelocity_UnitsPer100ms = ((Robot.m_oi.drvJoy.getThrottle() + 1)/2) * 1500;
    Robot.shooter.shooterMotor.set(ControlMode.Velocity, 200);
    Robot.shooter.shooterMotor2.set(ControlMode.Velocity, 200);
    SmartDashboard.putNumber("velocity 1:", Robot.shooter.shooterMotor.getSelectedSensorVelocity());
    SmartDashboard.putNumber("velocity 2:", Robot.shooter.shooterMotor2.getSelectedSensorVelocity());
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {

  }
}
