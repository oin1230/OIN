package Question6;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<MusicVO> MusicPlay = new ArrayList<MusicVO>();

		System.out.println("====뮤직 플레이어====");
		while (true) {
			
			System.out.print("1.등록 2.목록 3.삭제 4.전체삭제 5.종료 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("====등록====");
				System.out.print("제목 : ");
				String title = sc.next();
				System.out.print("가수 : ");
				String singer = sc.next();
				System.out.print("시간 : ");
				int playTime = sc.nextInt();

				MusicPlay.add(new MusicVO(title, singer, playTime));

			} else if (choice == 2) {
				System.out.println("====노래목록====");

				for (int i = 0; i < MusicPlay.size(); i++) {

					System.out.println((i + 1) + ". 제목 : " + MusicPlay.get(i).getTitle() + "\t 가수 : "
							+ MusicPlay.get(i).getSinger() + "\t 시간 : " + MusicPlay.get(i).getPlayTime() + "초");
				}

			} else if (choice == 3) {
				System.out.println("====노래목록====");
				for (int i = 0; i < MusicPlay.size(); i++) {
					
					System.out.println((i + 1) + ". 제목 : " + MusicPlay.get(i).getTitle() + "\t" + "가수 : "
							+ MusicPlay.get(i).getSinger() + "\t" + MusicPlay.get(i).getPlayTime() + "초");
				}
				System.out.println("====노래삭제====");
				System.out.println("삭제하고 싶은 노래 번호 입력 : ");
				int delete = sc.nextInt();
				System.out.println(MusicPlay.get(delete - 1).getTitle() + " 노래를 삭제합니다.");
				MusicPlay.remove(delete - 1);

			} else if (choice == 4) {
				System.out.println("====전체노래삭제====");
				MusicPlay.clear();

			} else if (choice == 5) {

				break;

			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}

		}

	}

}
