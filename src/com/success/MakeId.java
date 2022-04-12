package org.success;
/*      아이디의 길이는 3자 이상 15자 이하
        아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용 가능
        단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.

        "네오"는 다음과 같이 7단계의 순차적인 처리 과정을 통해 신규 유저가 입력한 아이디가 카카오 아이디 규칙에 맞는 지 검사하고
        규칙에 맞지 않은 경우 규칙에 맞는 새로운 아이디를 추천해 주려고 합니다.
        신규 유저가 입력한 아이디가 new_id 라고 한다면,

        1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.

        2단계 '!', '@', '#', '*' 문자가 제거되었습니다.
        "...!@bat#*..y.abcdefghijklm" → "...bat..y.abcdefghijklm"

        3단계 '...'와 '..' 가 '.'로 바뀌었습니다.
        "...bat..y.abcdefghijklm" → ".bat.y.abcdefghijklm"

        4단계 아이디의 처음에 위치한 '.'가 제거되었습니다.
        ".bat.y.abcdefghijklm" → "bat.y.abcdefghijklm"

        5단계 아이디가 빈 문자열이 아니므로 변화가 없습니다.
        "bat.y.abcdefghijklm" → "bat.y.abcdefghijklm"

        6단계 아이디의 길이가 16자 이상이므로, 처음 15자를 제외한 나머지 문자들이 제거되었습니다.
        "bat.y.abcdefghijklm" → "bat.y.abcdefghi"

        7단계 아이디의 길이가 2자 이하가 아니므로 변화가 없습니다.
        "bat.y.abcdefghi" → "bat.y.abcdefghi"

        따라서 신규 유저가 입력한 new_id가 "...!@BaT#*..y.abcdefghijklm"일 때,
        네오의 프로그램이 추천하는 새로운 아이디는 "bat.y.abcdefghi" 입니다.
*/

public class MakeId {
    public static String solution(String new_id) {
        String answer = "";

        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z-_.0-9]","");
        answer = answer.replaceAll("[.]+",".");
        answer = answer.replaceAll("^[.]|[.]$","");
        answer = answer.replaceAll("\\s","a");
        if(answer.length()>=16){
            answer = answer.substring(0,15);
            answer = answer.replaceAll("^[.]|[.]$","");
        }else if(answer.length()<=2 && answer.length()>0){
            while(answer.length()<=2) {
                answer = answer + (answer.substring(answer.length() - 1));
            }
        }else if(answer.length() == 0){
            answer = "aaa";
        }
        return answer;
    }




    //main
    public static void main(String[] args) {
        String a = "...!@B이-슬 ___--a4334T#*..y.abcdef3232dssdghijklm";
        String b = "SameDew이슬234!!..";
        String solution = solution("abcdefghijklmn.p");
        System.out.println(solution);

    }
}
