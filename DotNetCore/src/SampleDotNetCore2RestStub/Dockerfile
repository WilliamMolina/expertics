FROM microsoft/dotnet:2.0-sdk
COPY bin/Debug/netcoreapp2.0 /root/
WORKDIR /root/
ENV ASPNETCORE_URLS="http://*:80"
EXPOSE 80/tcp
ENTRYPOINT ["dotnet", "SampleDotNetCore2RestStub.dll"]