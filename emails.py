import os
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

sender_email = 'ombothre1024@gmail.com'
password = 'whvzuayykeypbvqb'

smtp_server = os.environ.get('SMTP_SERVER')
smtp_port  = int(os.environ.get('SMTP_PORT'))

url = "https://www.google.co.in"

def send_certificates(email):
    msg = MIMEMultipart()
    msg['From'] = sender_email
    msg['To'] = email
    msg['Subject'] = "Your test link"

    body = "Please find attached link for your test"

    msg.attach(MIMEText(body,'plain'))


    with smtplib.SMTP(smtp_server,smtp_port) as server:
        server.starttls()
        server.login(sender_email,password)
        server.send_message(msg)

send_certificates(input("Enter sender email : "))