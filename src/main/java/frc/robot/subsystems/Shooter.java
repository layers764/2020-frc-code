/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;
import frc.robot.commands.FlywheelOff;

/**
 * Add your docs here.
 */
public class Shooter extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public WPI_TalonSRX shooterMotor = new WPI_TalonSRX(RobotMap.SHOOTER_MOTOR_1);
  public WPI_TalonSRX shooterMotor2 = new WPI_TalonSRX(RobotMap.SHOOTER_MOTOR_2);
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new FlywheelOff());
  }
  public Shooter(){
    shooterMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
    shooterMotor.setSensorPhase(true);

    /*shooterMotor.configNominalOutputForward(0);
    shooterMotor.configNominalOutputReverse(0);
    shooterMotor.configPeakOutputForward(1);
    shooterMotor.configPeakOutputReverse(-1);*/

    shooterMotor.config_kF(0,2.73);
    shooterMotor.config_kP(0,6);
    //shooterMotor.config_kI(0,.005);
    shooterMotor.config_kD(0,30);
    //shooterMotor.configAllowableClosedloopError(0, 0, 0);

    shooterMotor2.config_kF(0,2.73);
    shooterMotor2.config_kP(0,5);
    shooterMotor2.config_kI(0,0.005);
    shooterMotor2.config_kD(0,11);
  }
  public void setSpeed(double speed){
    shooterMotor.set(ControlMode.PercentOutput, speed);
    shooterMotor2.set(ControlMode.PercentOutput, speed);
  }
  public void speedSetpoint(double speed){
    double targetVelocity_UnitsPer100ms = speed * 4096 * 500.0 / 600;
    SmartDashboard.putNumber("", targetVelocity_UnitsPer100ms);
    

    //shooterMotor.set(ControlMode.Velocity, targetVelocity_UnitsPer100ms);
  }
}
