# ใช้ base image ของ OpenJDK
FROM openjdk:17-jdk-slim

# ตั้งค่าตำแหน่งทำงานใน container
WORKDIR /app

# คัดลอกไฟล์ JAR เข้าไปใน container
COPY target/hello-1.0.0.jar app.jar

# เปิดพอร์ต 8080
EXPOSE 9080

# รันแอปพลิเคชัน
ENTRYPOINT ["java", "-jar", "app.jar"]
