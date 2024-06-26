// we can configure and export axios object that  we will
// use to make HTTP requests to the relevant API through this code.

import axios from 'axios';

export default axios.create({
  baseURL: "http://localhost:8080",

});