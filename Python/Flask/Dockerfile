FROM python:3.11-slim

WORKDIR /app

COPY requirements.txt .

RUN pip install -r requirements.txt

COPY . .
RUN chmod +x boot.sh

EXPOSE 5000
ENTRYPOINT [ "./boot.sh" ]
