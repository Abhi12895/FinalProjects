FROM node:21.0-alpine3.17

COPY package.json /app/
COPY src /app/

WORKDIR /app
RUN npm install

CMD [ "node","server.js" ]



# to run in CMD
# labuser@ip-172-31-1-17:~/Docker-Express$ sudo su
# root@ip-172-31-1-17:/home/labuser/Docker-Express# docker build -t express-app:1.0 
# root@ip-172-31-1-17:/home/labuser/Docker-Express# docker run -d -p 9000:3000 express-app:1.0 
# root@ip-172-31-1-17:/home/labuser/Docker-Express# docker ps -a

