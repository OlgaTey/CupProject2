package team.selfChoice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PlayerDTO {
    private Long id;
    private Long profileId;
    private String nickname;
    private Long teamId;
    private String country;
}
