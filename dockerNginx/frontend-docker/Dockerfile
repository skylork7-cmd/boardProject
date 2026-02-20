# Dockerfile Nginx
# 1 Step : build
FROM node:20-alpine AS build
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build

# 2 Step : nginx
FROM nginx:alpine
COPY --from=build /app/dist /usr/share/nginx/html
ARG ENV=dev
COPY nginx.${ENV}.conf /etc/nginx/conf.d/default.conf
