/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import java.lang.System;
//import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.DoubleSolenoid;
//import edu.wpi.first.wpilibj.Solenoid;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value;;
public class Intake_ON extends CommandBase {
  /**
   * Creates a new Intake_ON.
   */
  Intake intake;
  DoubleSolenoid ActuateSolenoid = new DoubleSolenoid(0, 1); 
  public Intake_ON(Intake subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    intake = subsystem;
    addRequirements(intake);
    System.out.println("Intake Activated");
  }
  
  // Called when the command is initially scheduled.
 
  @Override
   public void initialize() {
   ActuateSolenoid.set(Value.kForward);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    delay(500);
    Intake.setSpeed(10);
  }

  private void delay(int i) {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
