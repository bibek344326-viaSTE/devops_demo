package via.doc1.devopsdemo.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.test.web.servlet.MockMvc;

import via.doc1.devopsdemo.model.Task;
import via.doc1.devopsdemo.model.TeamMember;

public class TeamServiceTest {
    @SuppressWarnings("unused")
    private MockMvc mockMvc;

    @MockBean
    private TeamService teamService = new TeamService();

    @Test
    static void testTeamService() {
        TeamService teamService = new TeamService();
        System.out.println(teamService);
    }

    @Test
    public void testGetTeamMember() {
        TeamMember teamMember = teamService.getTeamMember("Member1");
        System.out.println(teamMember);
    }

    @Test
    public Task testGetTask() {
        Task task = teamService.getTask("Member1", "Task1");
        System.out.println(task);
        return task;
    }

    @Test
    public List<Task> testGetTasks() {
        return teamService.getTasks("Member1");
    }

}
