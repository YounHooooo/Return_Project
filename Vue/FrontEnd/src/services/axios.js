import axios from 'axios'

const instance = axios.create ({
    baseURL: 'http://192.168.0.30:8080'
    // timeout: 'http://192.168.0.4/api',
    // withCredentials: true
})
export default instance