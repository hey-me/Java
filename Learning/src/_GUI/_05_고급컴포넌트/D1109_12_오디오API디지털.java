package _GUI._05_고급컴포넌트;

import java.io.*;
import javax.sound.sampled.*;

public class D1109_12_오디오API디지털 {
/*	*자바의 오디오 API로 다룰 수 있는 오디오 종류
		-디지털 오디오(Digital Audio)
			음악, 목소리 등의 아날로그 데이터를 디지털로 만든 오디오
			WAV, AU, AIFF, AIFC
		-미디(MIDI: Music Instrument Digital Interface) 데이터
			피아노, 바이올린 등 악기 소리와 높이 등을 표현하는 오디오
			미디 장치에서 연주

	*디지털 오디오 재생 과정   */
	public static void main(String[] args) throws Exception {
//		1. 오디오 클립 만들기 : Clip 인터페이스 이용
		Clip clip = AudioSystem.getClip();
	
//	2. 오디오 클립에 오디오 스트림 연결.
//		오디오 파일로부터 오디오를 읽을스트림 객체 생성
		File audioFile = new File("애국가.wav");
		AudioInputStream audioStream =    
        AudioSystem.getAudioInputStream(audioFile);

//   	오디오 클립에 오디오 스트림 연결
		clip.open(audioStream); 

//	3. 오디오 재생
//		Clip 클래스의 start() 메소드 호출
		clip.start(); // 오디오 재생 시작
	}
/*
	 void open(AudioInputStream stream)
	 	오디오 클립은 stream에 존재하는 오디오의 형식과 데이터를 인식하고, 재생할 수 있는 준비를 갖춘다
	 
	 void start()
	 	현재 프레임 위치에서 오디오 클립을 재생. 처음 실행될 때 프레임 위치는 0
	 
	 void stop()
	 	재생중인 오디오 클립의 재생을 중단한다.
	 
	 void setFramePosition(int frames)
	 	오디오 샘플 내에 재생할 프레임의 위치를 지정. 프레임 시작번호는 0
	 
	 void loop(int count)
	 	현재 프레임 위피에서 시작해 count만큼 반복 재생.
	 	count값이 LOOP_CONTINUOUSLY면 무한 반복.
	 
	 void close()
	 	오디오 클립의 모든 자원을 반환.
*/

}
