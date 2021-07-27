import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

const TEAM_API = 'http://localhost:8080/BusyQACRMBackEnd/api/team/';
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
};
@Injectable({
  providedIn: 'root',
})
export class TeamService {
  constructor(private http: HttpClient) {}

  getAllTeams(): Observable<any> {
    return this.http.get(TEAM_API + 'getAllTeams', httpOptions);
  }

  removeUserFromTeam(userId, teamId): Observable<any> {
    return this.http.post(
      TEAM_API + 'signup',
      {
        userId: userId,
        teamId: teamId,
      },
      httpOptions
    );
  }
}
