	package mp3Player;

import java.util.ArrayList;
import java.util.Scanner;
import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1. 노래를 재생시키는 도구 꺼내오기
		// --> MP3Player
		MP3Player mp3 = new MP3Player();
		String comPath = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\Ex0115ArrayList\\player\\";

		// 노래데이터를 전부 저장하는 ArrayList 생성, 이름은 musicList
		ArrayList<Music> musicList = new ArrayList<Music>();

		// 2. 노래데이터(Music 객체) 생성
		Music m1 = new Music("하입보이요", "뉴진스", 180, comPath + "HypeBoy.mp3");
		musicList.add(m1);
		// iam / 아이브 / 198 / 경로
		musicList.add(new Music("IAM", "아이브", 198, comPath + "IAM.mp3"));
		// lovelee / 악동뮤지션 / 200 /경로
		musicList.add(new Music("LoveLee", "악동뮤지션", 200, comPath + "LoveLee.mp3"));
		// smoke / 다이나믹듀오 / 210 / 경로
		musicList.add(new Music("Smoke", "다이나믹듀오", 210, comPath + "Smoke.mp3"));
		// 한페이지가될수있게 / 데이식스 / 210 / 경로
		musicList.add(new Music("한페이지가될수있게", "데이식스", 210, comPath + "한페이지가될수있게.mp3"));
		// 노래 전부 musicList 에 추가
		int i = 0; // 몇번째 곡인지 기억하고 있는 변수

		System.out.println("========== ㅇㅇㅇㅇ Mp3플레이어 ===========");
		while (true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >>");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("======재생======");
				// 1. 재생중인 노래가 있는지 여부를 판단
				mp3.isPlaying();
				// 2. 재생중이라면 노래를 멈추기
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				// 3. musicList의 0번 방에 있는 노래를 재생
				// 노래를 재생하기 위해서 필요한 데이터는?
				// 노래의 주소가 필요함

				mp3.play(musicList.get(i).getPath());

				// 4. 가수 - 노래제목 이 재생중입니다. 출력
				// ex) 뉴진스 - Hypeboy 이(가) 재생중입니다.
				System.out
						.println(musicList.get(i).getSinger() + " - " + musicList.get(i).getTitle() + " 이(가) 재생중입니다.");

			} else if (input == 2) {
				System.out.println("======정지======");
				// 1. 노래가 재생중인지 여부 판단
				if (mp3.isPlaying()) {
					// 2. 재생중이라면 노래를 멈추고
					// "노래재생을 정지합니다!" 출력
					mp3.stop();
					System.out.println("노래재생을 정지합니다!");
				} else {
					// 3. 재생중이 아니라면
					// " 재생중인 노래가 없습니다. 출력
					System.out.println("재생중인 노래가 없습니다.");
				}

			} else if (input == 3) {
				System.out.println("======이전곡======");
				// 1. 노래가 재생중인지 여부 확인
				if (mp3.isPlaying()) {
					// 2. 재생중이라면 노래를 정지
					mp3.stop();
				}
				
				i--;

				if (i >= 0) {
					// 3. musicList 이전곡 재생
					// i의 값이 2---->1
					mp3.play(musicList.get(i).getPath());

					// 4. 재생중인 노래의 정보 출력
					System.out.println(
							musicList.get(i).getSinger() + " - " + musicList.get(i).getTitle() + " 이(가) 재생중입니다.");
				} else {
					System.out.println("이전 곡이 없습니다.");
					i = 0;
				}

			} else if (input == 4) {
				System.out.println("======다음곡======");
				// 0 ----> 1 / 1 ----> 2
				// 1. 재생중인 노래여부 판단
				if (mp3.isPlaying()) {
					// 2. 재생중이라면 노래를 정지
					mp3.stop();
				}
				i++;
				if (i < musicList.size()) {
					// 3. musicList의 i번 방에 있는 노래를 재생
					mp3.play(musicList.get(i).getPath());

					// 4. 가수 - 노래제목 이 재생중입니다. 출력
					// ex) 뉴진스 - Hypeboy 이(가) 재생중입니다.
					System.out.println(
							musicList.get(i).getSinger() + " - " + musicList.get(i).getTitle() + " 이(가) 재생중입니다.");
				} else {
					// 5. 단, 다음곡이 없다면
					// " 다음곡이 없습니다." 를 출력
					System.out.println("다음곡이 없습니다.");

					// 6. 다시 재생을 선택한다면, musicList의 마지막 곡이 재생되게만들기
					i = musicList.size() - 1;
				}

			} else if (input == 5) {
				if (mp3.isPlaying()) {
					// 2. 재생중이라면 노래를 정지
					mp3.stop();
				}
				System.out.println("=====Mp3플레이어종료======");
				break;
			} else {
				System.out.println("번호를 잘못 누르셨습니다.");
			}
		}

	}

}
