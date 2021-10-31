package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name = "ShaanTeleOp", group = "LinearOpMode")

public class ShaanTeleop extends LinearOpMode{
    DcMotor backLeftMotor;
    DcMotor backRightMotor;
    DcMotor frontLeftMotor;
    DcMotor frontRightMotor;
    DcMotor Intake;
    CRServo LiftServo;
    CRServo BoxServo;
    Servo Carousel;

    public void runOpMode(){
        backLeftMotor = hardwareMap.get(DcMotor.class, "backLeftMotor");
        backRightMotor = hardwareMap.get(DcMotor.class, "backRightMotor");
        frontRightMotor = hardwareMap.get(DcMotor.class, "frontRightMotor");
        frontLeftMotor = hardwareMap.get(DcMotor.class, "backRightMotor");
        //rightMotor.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();

        while(opModeIsActive()){
            boolean intakePower = gamepad1.left_bumper;
            boolean liftPower = gamepad1.right_bumper;
            double horizontal = gamepad1.left_stick_x;
            double vertical = gamepad1.left_stick_y;
            double turn = gamepad1.right_stick_x;
            if (intakePower) {
                Intake.setPower(1);
            }
            if (liftPower) {
                LiftServo.setPower(1);
            }
            backLeftMotor.setPower(vertical + turn - horizontal);
            frontLeftMotor.setPower(vertical + turn + horizontal);
            backRightMotor.setPower(vertical - turn + horizontal);
            frontRightMotor.setPower(vertical - turn - horizontal);
            Carousel.setDirection(Servo.Direction.FORWARD);
            Carousel.setPosition(1);
            sleep(3000);
            backLeftMotor.setPower(0);
            frontLeftMotor.setPower(0);
            backRightMotor.setPower(0);
            frontRightMotor.setPower(0);
            Carousel.setPosition(1);
            sleep(3000);


        }
    }






        }



