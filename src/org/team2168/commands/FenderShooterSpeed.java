package org.team2168.commands;

import org.team2168.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class FenderShooterSpeed extends CommandBase {
	
	public void FenderShooterSpeed(){
		requires(shooter);
	}

	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		// TODO Auto-generated method stub
		shooter.setPoint(RobotMap.HIGH_GOAL_FORWARD);
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		// TODO Auto-generated method stub

	}

	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}