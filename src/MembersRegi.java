import java.util.Scanner;




public class MembersRegi {

	private String memberName;
	private String memberPhoneNum;
	private String memberId;
	private String memberPw;
	private boolean temp = false;

	private Scanner sc = new Scanner(System.in);


	public MembersRegi()
	{
		System.out.println();
		System.out.println("SIGN UP");
		System.out.print("이름 입력 : ");
		while(true)
		{
			memberName = sc.nextLine();			// 새로운 사용자 이름
			if(memberName.matches("[가-힣]{2,6}"))
			{
				break;
			}
			else
			{
				System.out.print("다시 이름 입력(한글로만 입력 가능 ) : ");
			}
		}

		System.out.print("전화번호 입력 : ");

		while(!temp)
		{
			memberPhoneNum = sc.nextLine();	
			// 새로운 사용자 전화번호
			if(memberPhoneNum.matches("01[016789]-(\\d{4})-(\\d{4})"))
			{
				temp=true;
			}
			else
			{
				System.out.print("다시13자리  번호 입력 : ");
			}

		}
		System.out.print("아이디 입력 : ");

		while(true)
		{
			memberId=sc.nextLine();	
			if(!constants.isRegistId(memberId) )
			{
				if(memberId.matches("^[a-z0-9_-]{3,16}$"))
				{
					break;
				}
				else
				{
					System.out.print("다시 아이디 입력(영어 소문자와 숫자로만 특수문자 _ , - 허용) : ");
				}

			}
			else 
			{
				System.out.print("다시 아이디 입력(이미 누가 쓰고 있는 id) : ");
			}
		}
		System.out.print("비밀번호입력 : ");
		while(true)
		{
			memberPw=sc.nextLine();
			if(memberPw.matches("^[a-z0-9_-]{3,16}$"))
			{
				break;
			}
			else
			{
				System.out.print("영어 소문자와 숫자로만 다시 입력 : ");
			}
		}
		

		MembersInfor memberInfo = new MembersInfor(memberName, memberPhoneNum,memberId,memberPw);		// 사용자 정보 담은 클래스



		constants.allMemberList.add(memberInfo);								// 새로운 사용자 정보 저장

		System.out.println("새로운 사용자가 등록완료!!");		// 새로운 회원 등록 완료 메시지




	}


}
