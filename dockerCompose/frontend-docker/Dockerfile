# Dockerfile
FROM node:20-alpine
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
#COPY .env.docker .env
EXPOSE 5173
#CMD ["npm", "start"]
#CMD ["npm", "run", "dev"]
CMD ["npm", "run", "dev", "--", "--host"]