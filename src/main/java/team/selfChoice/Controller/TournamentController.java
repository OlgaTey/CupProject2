package team.selfChoice.Controller;

import org.springframework.web.bind.annotation.*;
import team.selfChoice.DTO.JudgeDTO;
import team.selfChoice.DTO.ManagerDTO;
import team.selfChoice.DTO.TeamDTO;
import team.selfChoice.DTO.TournamentDTO;

import java.util.ArrayList;

@RestController
public interface TournamentController {

    @PostMapping("/tournament")
    public void postTournament(@RequestBody TournamentDTO tournament);

    @GetMapping("/tournament/{tournamentId}")
    public TournamentDTO getTournamentById(@PathVariable Long tournamentId);

    @DeleteMapping("/tournament/{tournamentId}")
    public void deleteTournamentById(@PathVariable Long tournamentId);

    @PutMapping("/tournament/{tournamentId}")
    public void putTournamentById(@PathVariable Long tournamentId, @RequestBody TournamentDTO tournament);

    @PutMapping("/tournament/{tournamentId}/changeManager")
    public void putManagerByTournamentId(@PathVariable Long tournamentId, @RequestBody ManagerDTO manager);

    @PostMapping("/tournament/{tournamentId}/addJudge")
    public void addJudgeByTournamentId(@PathVariable Long tournamentId, @RequestBody JudgeDTO judge);
    @GetMapping("/tournament/{tournamentId}/teams")
    public ArrayList<TeamDTO> getTeamsByTournamentId(@PathVariable Long tournamentId);
    @GetMapping("/tournaments")
    public ArrayList<TournamentDTO> getLastTournaments(@RequestParam(required = false,
            defaultValue = "5") Integer pageSize,
                                                       @RequestParam(required = false,
                                                               defaultValue = "1") Integer pageNumber);

}
