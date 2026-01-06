package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.util.ElapsedTime;


import java.util.ArrayList;
 @TeleOp(name = "Get Motor To Move", group = "Practice")
public class getmotortomove extends LinearOpMode {
    private DcMotor motor;
 
    @Override
    public void runOpMode() {
        motor = hardwareMap.get(DcMotor.class, "motor");

        waitForStart();
        leftDrive = hardwareMap.get(DcMotor.class, "leftDrive");

        motor.setPower(1.0); // Set motor power to full forward
       
       sleep(10000); // Run motor for 10 seconds

        motor.setPower(0); // Stop the motor 
    }
}
