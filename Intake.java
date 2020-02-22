/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.Intake_Off;
//import edu.wpi.first.wpilibj.DoubleSolenoid;
public class Intake extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */
  static CANSparkMax Intake = new CANSparkMax(Constants.Intake_Port, MotorType.kBrushless);

  public Intake() {
  setDefaultCommand(new Intake_Off());
  }
  
  public static void setSpeed(double speed) {
    Intake.set(speed);
  
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
