import {Component} from "@angular/core";
import {Http} from "@angular/http";
import {environment} from "../environments/environment";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'app works!';
  result = '';

  constructor(private http: Http) {

  }

  private sayHello(): void {
    this.result = 'loading...';
    this.http.get(environment.host + '/rest-garage-sample/garage')
      .subscribe(resp => this.result = resp.text());
  }
}
