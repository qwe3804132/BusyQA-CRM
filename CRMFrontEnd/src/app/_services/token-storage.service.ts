import { Injectable } from '@angular/core';
const KEYTOKEN = 'auth-token';
const KEYUSER = 'auth-user';
@Injectable({
  providedIn: 'root',
})
export class TokenStorageService {
  constructor() {}

  signOut(): void {
    window.sessionStorage.clear();
  }

  saveToken(token: string): void {
    window.sessionStorage.removeItem(KEYTOKEN);
    window.sessionStorage.setItem(KEYTOKEN, token);
  }

  getToken(): string {
    return sessionStorage.getItem(KEYTOKEN); //non-null assertion operator
  }

  saveUser(user: any): void {
    window.sessionStorage.removeItem(KEYUSER);
    window.sessionStorage.setItem(KEYUSER, JSON.stringify(user));
  }

  getUser(): any {
    return JSON.parse(sessionStorage.getItem(KEYUSER));
  }
}
