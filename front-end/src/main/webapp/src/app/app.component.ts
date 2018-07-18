import {Component} from "@angular/core";
import {Http} from "@angular/http";

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
    this.http.get('http://localhost:8080/rest-garage-sample/garage')
      .subscribe(resp => this.result = resp.text());
  }
}
