import axios from "axios";
import authHeader from "./auth-header";

const API_URL = "http://localhost:2211/users/";

const getPublicContent = () => {
  return axios.get(API_URL + "all");
};

const getCustomerBoard = () => {
  return axios.get(API_URL + "customer", { headers: authHeader() });
};

const getManagerBoard = () => {
  return axios.get(API_URL + "manager", { headers: authHeader() });
};

const getAdminBoard = () => {
  return axios.get(API_URL + "admin", { headers: authHeader() });
};

export default {
  getPublicContent,
  getCustomerBoard,
  getManagerBoard,
  getAdminBoard,
};