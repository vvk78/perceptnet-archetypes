package ${package}.general.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl {

    protected final Logger log = LoggerFactory.getLogger(getClass());

}