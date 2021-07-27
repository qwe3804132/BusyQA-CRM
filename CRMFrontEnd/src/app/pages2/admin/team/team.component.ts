import { TeamService } from './../../../_services/team.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-team',
  templateUrl: './team.component.html',
  styleUrls: ['./team.component.css'],
})
export class TeamComponent implements OnInit {
  constructor(private teamService: TeamService) {}
  teamData = [];
  ngOnInit(): void {
    this.teamService.getAllTeams().subscribe(
      (data) => {
        this.teamData = data;
        console.log(this.teamData);
      },
      (err) => {
        console.log(err.error.message);
      }
    );
  }
}
