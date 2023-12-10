from flask import Flask, request
import os
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

app = Flask(__name__)

@app.route('/send_email', methods=['POST'])
def send_email():
    sender_email = 'ombothre1024@gmail.com'
    password = 'whvzuayykeypbvqb'
    smtp_server = os.environ.get('SMTP_SERVER')
    smtp_port = int(os.environ.get('SMTP_PORT'))

    email = request.json.get('email')  # Get email from the request

    msg = MIMEMultipart()
    msg['From'] = sender_email
    msg['To'] = email
    msg['Subject'] = "Your test link"
    body = "Please find attached link for your test"
    msg.attach(MIMEText(body, 'plain'))

    with smtplib.SMTP(smtp_server, smtp_port) as server:
        server.starttls()
        server.login(sender_email, password)
        server.send_message(msg)

    return 'Email sent successfully'

if __name__ == '__main__':
    app.run(debug=True)