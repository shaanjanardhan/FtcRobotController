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
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();

        while(opModeIsActive()){
            leftMotor.setPower(gamepad1.right_stick_y);
            rightMotor.setPower(gamepad1.right_stick_y);

            while(gamepad1.dpad_left) {
                leftMotor.setPower(-1);
                rightMotor.setPower(1);
            }

            while(gamepad1.dpad_right) {
                leftMotor.setPower(1);
                rightMotor.setPower(-1);
            }

            leftMotor.setPower(0);
            rightMotor.setPower(0);
        }


    }

}
