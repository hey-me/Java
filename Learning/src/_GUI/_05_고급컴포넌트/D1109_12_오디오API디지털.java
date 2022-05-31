package _GUI._05_���������Ʈ;

import java.io.*;
import javax.sound.sampled.*;

public class D1109_12_�����API������ {
/*	*�ڹ��� ����� API�� �ٷ� �� �ִ� ����� ����
		-������ �����(Digital Audio)
			����, ��Ҹ� ���� �Ƴ��α� �����͸� �����з� ���� �����
			WAV, AU, AIFF, AIFC
		-�̵�(MIDI: Music Instrument Digital Interface) ������
			�ǾƳ�, ���̿ø� �� �Ǳ� �Ҹ��� ���� ���� ǥ���ϴ� �����
			�̵� ��ġ���� ����

	*������ ����� ��� ����   */
	public static void main(String[] args) throws Exception {
//		1. ����� Ŭ�� ����� : Clip �������̽� �̿�
		Clip clip = AudioSystem.getClip();
	
//	2. ����� Ŭ���� ����� ��Ʈ�� ����.
//		����� ���Ϸκ��� ������� ������Ʈ�� ��ü ����
		File audioFile = new File("�ֱ���.wav");
		AudioInputStream audioStream =    
        AudioSystem.getAudioInputStream(audioFile);

//   	����� Ŭ���� ����� ��Ʈ�� ����
		clip.open(audioStream); 

//	3. ����� ���
//		Clip Ŭ������ start() �޼ҵ� ȣ��
		clip.start(); // ����� ��� ����
	}
/*
	 void open(AudioInputStream stream)
	 	����� Ŭ���� stream�� �����ϴ� ������� ���İ� �����͸� �ν��ϰ�, ����� �� �ִ� �غ� �����
	 
	 void start()
	 	���� ������ ��ġ���� ����� Ŭ���� ���. ó�� ����� �� ������ ��ġ�� 0
	 
	 void stop()
	 	������� ����� Ŭ���� ����� �ߴ��Ѵ�.
	 
	 void setFramePosition(int frames)
	 	����� ���� ���� ����� �������� ��ġ�� ����. ������ ���۹�ȣ�� 0
	 
	 void loop(int count)
	 	���� ������ ���ǿ��� ������ count��ŭ �ݺ� ���.
	 	count���� LOOP_CONTINUOUSLY�� ���� �ݺ�.
	 
	 void close()
	 	����� Ŭ���� ��� �ڿ��� ��ȯ.
*/

}
