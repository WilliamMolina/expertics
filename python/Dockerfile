FROM python:3 as base

FROM base as builder

RUN mkdir /install
WORKDIR /install

COPY requirements.txt /requirements.txt

RUN pip install --install-option="--prefix=/install" -r /requirements.txt

FROM base

COPY --from=builder /install /usr/local
COPY . /app
ENV FLASK_APP=server.py
WORKDIR /app
RUN adduser -D -u 1000 pythonuser
USER pythonuser
CMD ["flask", "run", "--host=0.0.0.0"]
EXPOSE 5000 