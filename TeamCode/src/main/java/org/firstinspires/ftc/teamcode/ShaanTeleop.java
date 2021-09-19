package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "ShaanTeleOp", group = "LinearOpMode")

public class ShaanTeleop extends LinearOpMode{
    DcMotor leftMotor;
    DcMotor rightMotor;

    public void runOpMode(){
        leftMotor = hardwareMap.get(DcMotor.class, "LM");
        rightMotor = hardwareMap.get(DcMotor.class, "RM");

        waitForStart();

        while(opModeIsActive()){
            leftMotor.setPower(-1 * gamepad1.left_stick_y);
            rightMotor.setPower(gamepad1.right_stick_y);

        }


    }

}
