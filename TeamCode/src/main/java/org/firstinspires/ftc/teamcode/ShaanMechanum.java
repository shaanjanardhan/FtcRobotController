package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "ShaanMechanum", group = "LinearOpMode")
public class ShaanMechanum extends LinearOpMode{
    DcMotor FrontRight;
    DcMotor FrontLeft;
    DcMotor BackRight;
    DcMotor BackLeft;

    public void runOpMode() throws InterruptedException {
        waitForStart();
        while(opModeIsActive()) {
            double horizontal = gamepad1.left_stick_x;
            double vertical = gamepad1.left_stick_y;
            double turn = gamepad1.right_stick_x;
            BackLeft.setPower(vertical + turn - horizontal);
            FrontRight.setPower(vertical + turn + horizontal);
            BackRight.setPower(vertical - turn + horizontal);
            FrontLeft.setPower(vertical - turn - horizontal);
        }
    }





}
