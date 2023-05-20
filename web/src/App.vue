<template>
  <NavBar />
  <router-view></router-view>
</template>

<script>
import NavBar from "./components/NavBar.vue";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap";
import $ from "jquery";
export default {
  components: {
    NavBar,
    NavBar,
  },

  setup() {
    // $.ajax({
    //   url: "http://159.75.69.201:1234/user/account/token/",
    //   type: "post",
    //   data: {
    //     username: "lnw",
    //     password: "123456",
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   },
    // });
    // $.ajax({
    //   url: "http://159.75.69.201:1234/user/account/info/",
    //   type: "get",
    //   headers: {
    //     Authorization:
    //       "Bearer " +
    //       "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIwODg4Y2E3MDM1YTg0OGMxOGFjNGFhMGQ1MjlmMWFlNyIsInN1YiI6IjEiLCJpc3MiOiJzZyIsImlhdCI6MTY2NDg4OTIwNCwiZXhwIjoxNjY2MDk4ODA0fQ.hAE2HAK94bOtf3DHRbVWwsb1mU9UyV61kNrZQmhNcHQ",
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   },
    // });
    // $.ajax({
    //   url: "http://159.75.69.201:1234/user/account/register/",
    //   type: "post",
    //   data: {
    //     username: "ysw",
    //     password: "123456",
    //     confirmedPassword: "123456",
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   },
    // });
  },
};
</script>



<style>
body {
  background-image: url("@/assets/images/bg.jpg");
  background-size: cover;
}
</style>
