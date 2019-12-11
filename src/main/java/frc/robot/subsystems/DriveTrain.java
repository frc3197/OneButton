/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap.CANSparkMaxID;
import frc.robot.commands.Drive;
public class DriveTrain extends Subsystem {

public static CANSparkMax max = new CANSparkMax(CANSparkMaxID.kMotor1.id, MotorType.kBrushless);

public DriveTrain(){

max.setIdleMode(IdleMode.kBrake);



   }
  @Override
  public void initDefaultCommand() {
 setDefaultCommand(new Drive(this));
  }
}



