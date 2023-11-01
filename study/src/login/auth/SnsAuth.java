package login.auth;

import login.dto.MemberDTO;

public interface SnsAuth {

    boolean login(MemberDTO memberDTO);
}
