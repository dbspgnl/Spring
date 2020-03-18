package Spring05_test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyNickPrn {
	@Autowired
	private Nickname nickname;
	
	public Nickname getNickname() {
		return nickname;
	}
	public void setNickname(Nickname nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "내 별명은"+nickname+"입니다.";
	}
	
}
